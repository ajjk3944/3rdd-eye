.class public final LMc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMc/b$a;
    }
.end annotation


# static fields
.field public static final c:LMc/b$a;


# instance fields
.field private final a:Lmc/a;

.field private final b:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LMc/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LMc/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LMc/b;->c:LMc/b$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Lmc/a;)V
    .locals 1

    const-string v0, "networkConnectionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidDeviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LMc/b;->a:Lmc/a;

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    new-instance p2, LMc/b$b;

    invoke-direct {p2, p0}, LMc/b$b;-><init>(LMc/b;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LMc/b;->b:Lgg/i;

    return-void
.end method

.method public static final synthetic c(LMc/b;)Lmc/a;
    .locals 0

    iget-object p0, p0, LMc/b;->a:Lmc/a;

    return-object p0
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LMc/b;->b:Lgg/i;

    return-object v0
.end method
