package com.meferi.scannerdemo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.meferi.scannerdemo.databinding.ActivityDeviceListBindingImpl;
import com.meferi.scannerdemo.databinding.ActivityMainBindingImpl;
import com.meferi.scannerdemo.databinding.ItemBtDeviceBindingImpl;
import com.meferi.scannerdemo.databinding.ViewRootBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDEVICELIST = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ITEMBTDEVICE = 3;

  private static final int LAYOUT_VIEWROOT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.meferi.scannerdemo.R.layout.activity_device_list, LAYOUT_ACTIVITYDEVICELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.meferi.scannerdemo.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.meferi.scannerdemo.R.layout.item_bt_device, LAYOUT_ITEMBTDEVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.meferi.scannerdemo.R.layout.view_root, LAYOUT_VIEWROOT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDEVICELIST: {
          if ("layout/activity_device_list_0".equals(tag)) {
            return new ActivityDeviceListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_device_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBTDEVICE: {
          if ("layout/item_bt_device_0".equals(tag)) {
            return new ItemBtDeviceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_bt_device is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWROOT: {
          if ("layout/view_root_0".equals(tag)) {
            return new ViewRootBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_root is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(3);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.drake.brv.DataBinderMapperImpl());
    result.add(new com.meferi.btscannersdk.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "data");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_device_list_0", com.meferi.scannerdemo.R.layout.activity_device_list);
      sKeys.put("layout/activity_main_0", com.meferi.scannerdemo.R.layout.activity_main);
      sKeys.put("layout/item_bt_device_0", com.meferi.scannerdemo.R.layout.item_bt_device);
      sKeys.put("layout/view_root_0", com.meferi.scannerdemo.R.layout.view_root);
    }
  }
}
