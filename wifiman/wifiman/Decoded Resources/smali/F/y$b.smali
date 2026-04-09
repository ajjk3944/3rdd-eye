.class final synthetic LF/y$b;
.super Lkotlin/jvm/internal/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final b:LF/y$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/y$b;

    invoke-direct {v0}, LF/y$b;-><init>()V

    sput-object v0, LF/y$b;->b:LF/y$b;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-string v0, "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z"

    const/4 v1, 0x1

    const-class v2, Lw0/d;

    const-string v3, "isCtrlPressed"

    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw0/b;

    invoke-virtual {p1}, Lw0/b;->f()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-static {p1}, Lw0/d;->e(Landroid/view/KeyEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
