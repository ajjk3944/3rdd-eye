.class final LI/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/f;

    invoke-direct {v0}, LI/f;-><init>()V

    sput-object v0, LI/f;->a:LI/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 0

    invoke-interface {p1, p2, p3, p4}, Landroid/view/inputmethod/InputConnection;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
