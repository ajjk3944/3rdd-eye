.class public final Lc/G$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# static fields
.field public static final a:Lc/G$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/G$g;

    invoke-direct {v0}, Lc/G$g;-><init>()V

    sput-object v0, Lc/G$g;->a:Lc/G$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmh/l;Lmh/l;Lmh/a;Lmh/a;)Landroid/window/OnBackInvokedCallback;
    .locals 1

    const-string v0, "onBackStarted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackProgressed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackInvoked"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackCancelled"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc/G$g$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lc/G$g$a;-><init>(Lmh/l;Lmh/l;Lmh/a;Lmh/a;)V

    return-object v0
.end method
