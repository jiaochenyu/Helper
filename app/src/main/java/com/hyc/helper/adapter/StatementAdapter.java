package com.hyc.helper.adapter;

import android.support.annotation.NonNull;
import android.util.SparseBooleanArray;
import com.hyc.helper.adapter.viewholder.StatementViewHolder;
import com.hyc.helper.base.adapter.BaseRecycleAdapter;
import com.hyc.helper.bean.StatementBean;
import java.util.List;

public class StatementAdapter extends BaseRecycleAdapter<StatementBean.StatementInfoBean,StatementViewHolder> {

  private SparseBooleanArray sparseBooleanArray;

  public StatementAdapter(
      List<StatementBean.StatementInfoBean> dataList, int layoutId,
      Class<StatementViewHolder> statementViewHolderClass) {
    super(dataList, layoutId, statementViewHolderClass);
    sparseBooleanArray = new SparseBooleanArray();
  }

  @Override
  public void onBindViewHolder(@NonNull StatementViewHolder baseViewHolder, int i) {
    baseViewHolder.setSparseBooleanArray(sparseBooleanArray);
    super.onBindViewHolder(baseViewHolder, i);
  }
}
