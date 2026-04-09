.class final LAh/b;
.super Lkotlin/reflect/jvm/internal/impl/builtins/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAh/b$a;
    }
.end annotation


# static fields
.field public static final h:LAh/b$a;

.field private static final i:Lkotlin/reflect/jvm/internal/impl/builtins/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LAh/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAh/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAh/b;->h:LAh/b$a;

    new-instance v0, LAh/b;

    invoke-direct {v0}, LAh/b;-><init>()V

    sput-object v0, LAh/b;->i:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    new-instance v0, Loi/f;

    const-string v1, "FallbackBuiltIns"

    invoke-direct {v0, v1}, Loi/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;-><init>(Loi/n;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f(Z)V

    return-void
.end method

.method public static final synthetic F0()Lkotlin/reflect/jvm/internal/impl/builtins/i;
    .locals 1

    sget-object v0, LAh/b;->i:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    return-object v0
.end method


# virtual methods
.method protected G0()LCh/c$a;
    .locals 1

    sget-object v0, LCh/c$a;->a:LCh/c$a;

    return-object v0
.end method

.method public bridge synthetic M()LCh/c;
    .locals 1

    invoke-virtual {p0}, LAh/b;->G0()LCh/c$a;

    move-result-object v0

    return-object v0
.end method
