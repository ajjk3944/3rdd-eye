.class public final Lbj/e;
.super Lbj/f;
.source "SourceFile"


# static fields
.field public static final c:Lbj/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbj/e;

    invoke-direct {v0}, Lbj/e;-><init>()V

    sput-object v0, Lbj/e;->c:Lbj/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbj/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final c([C)V
    .locals 1

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lbj/f;->a([C)V

    return-void
.end method

.method public final d()[C
    .locals 1

    const/16 v0, 0x80

    invoke-super {p0, v0}, Lbj/f;->b(I)[C

    move-result-object v0

    return-object v0
.end method
