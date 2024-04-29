package com.meferi.scannerdemo.databinding;
import com.meferi.scannerdemo.R;
import com.meferi.scannerdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_dev_name, 1);
        sViewsWithIds.put(R.id.tv_dev_address, 2);
        sViewsWithIds.put(R.id.btn_connect, 3);
        sViewsWithIds.put(R.id.btn_disconnect, 4);
        sViewsWithIds.put(R.id.battery, 5);
        sViewsWithIds.put(R.id.btn_vibrator, 6);
        sViewsWithIds.put(R.id.btn_buzzer, 7);
        sViewsWithIds.put(R.id.btn_led_red, 8);
        sViewsWithIds.put(R.id.btn_led_green, 9);
        sViewsWithIds.put(R.id.btn_led_blue, 10);
        sViewsWithIds.put(R.id.btn_scan, 11);
        sViewsWithIds.put(R.id.btn_device_firmware, 12);
        sViewsWithIds.put(R.id.input_mac, 13);
        sViewsWithIds.put(R.id.btn_qrcode, 14);
        sViewsWithIds.put(R.id.iv_qr_code, 15);
        sViewsWithIds.put(R.id.tv_received, 16);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[6]
            , (android.widget.EditText) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[16]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}