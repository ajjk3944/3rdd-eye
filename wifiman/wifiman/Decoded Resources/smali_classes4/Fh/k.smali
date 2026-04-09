.class public final LFh/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFh/k$a;
    }
.end annotation


# static fields
.field public static final c:LFh/k$a;


# instance fields
.field private final a:Lli/n;

.field private final b:LFh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFh/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFh/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFh/k;->c:LFh/k$a;

    return-void
.end method

.method private constructor <init>(Lli/n;LFh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LFh/k;->a:Lli/n;

    .line 4
    iput-object p2, p0, LFh/k;->b:LFh/a;

    return-void
.end method

.method public synthetic constructor <init>(Lli/n;LFh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LFh/k;-><init>(Lli/n;LFh/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lli/n;
    .locals 1

    iget-object v0, p0, LFh/k;->a:Lli/n;

    return-object v0
.end method

.method public final b()LBh/G;
    .locals 1

    iget-object v0, p0, LFh/k;->a:Lli/n;

    invoke-virtual {v0}, Lli/n;->q()LBh/G;

    move-result-object v0

    return-object v0
.end method

.method public final c()LFh/a;
    .locals 1

    iget-object v0, p0, LFh/k;->b:LFh/a;

    return-object v0
.end method
