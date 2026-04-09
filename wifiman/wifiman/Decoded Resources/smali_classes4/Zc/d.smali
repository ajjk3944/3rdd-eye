.class public final LZc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZc/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZc/d$a;
    }
.end annotation


# static fields
.field public static final b:LZc/d$a;


# instance fields
.field private final a:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZc/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZc/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LZc/d;->b:LZc/d$a;

    return-void
.end method

.method public constructor <init>(Ldd/a;)V
    .locals 3

    const-string v0, "latencyService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1388

    const/16 v1, 0x12c

    const-string v2, "8.8.8.8"

    invoke-interface {p1, v2, v0, v1}, Ldd/a;->a(Ljava/lang/String;II)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZc/d;->a:Lgg/i;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LZc/d;->a:Lgg/i;

    return-object v0
.end method
