package abi46_0_0.host.exp.exponent.modules.api.components.picker;

import com.facebook.infer.annotation.Assertions;
import abi46_0_0.com.facebook.react.uimanager.LayoutShadowNode;

public class ReactPickerShadowNode extends LayoutShadowNode {
    @Override
    public void setLocalData(Object data) {
        Assertions.assertCondition(data instanceof ReactPickerLocalData);
        setStyleMinHeight(((ReactPickerLocalData) data).getHeight());
    }
}
