.class final Ls/Q$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ls/Q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls/Q$a;

    invoke-direct {v0}, Ls/Q$a;-><init>()V

    sput-object v0, Ls/Q$a;->a:Ls/Q$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ls/P;
    .locals 7

    new-instance v6, Ls/P;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ls/P;-><init>(JLz/N;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls/Q$a;->a()Ls/P;

    move-result-object v0

    return-object v0
.end method
