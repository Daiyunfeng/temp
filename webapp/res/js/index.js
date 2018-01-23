$(function(){  
      
    //富文本编辑器  
    UM.getEditor('myEditor')  
      
    UM.Editor.prototype._bkGetActionUrl = UM.Editor.prototype.getActionUrl;  
    UM.Editor.prototype.getActionUrl = function(action){  
        if(action == '/resource/upload/images'){  
            return basePath+'resource/upload/images';  
        }else{  
            return this._bkGetActionUrl.call(this, action);  
        }  
    }  
});  