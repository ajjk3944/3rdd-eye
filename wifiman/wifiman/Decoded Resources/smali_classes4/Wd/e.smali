.class public final synthetic LWd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/ubiquiti/firmware/b;

.field public final synthetic b:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

.field public final synthetic c:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Lcom/ui/wifiman/model/ubiquiti/firmware/a;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWd/e;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/b;

    iput-object p2, p0, LWd/e;->b:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    iput-object p3, p0, LWd/e;->c:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 3

    iget-object v0, p0, LWd/e;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/b;

    iget-object v1, p0, LWd/e;->b:Lcom/ui/wifiman/model/ubiquiti/firmware/a;

    iget-object v2, p0, LWd/e;->c:Ljava/io/File;

    invoke-static {v0, v1, v2, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b;->e(Lcom/ui/wifiman/model/ubiquiti/firmware/b;Lcom/ui/wifiman/model/ubiquiti/firmware/a;Ljava/io/File;Lgg/j;)V

    return-void
.end method
