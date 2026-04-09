.class public final LAb/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAb/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LAb/g$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LAb/g$a;Lgg/z;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LAb/g$a;->b(Lgg/z;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lgg/z;)Lgg/z;
    .locals 1

    sget-object v0, LAb/g$a$a;->a:LAb/g$a$a;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
