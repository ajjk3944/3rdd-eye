.class final LQ/x$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LQ/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ/x$a;

    invoke-direct {v0}, LQ/x$a;-><init>()V

    sput-object v0, LQ/x$a;->a:LQ/x$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LL0/U;
    .locals 1

    invoke-static {}, LS/l;->a()LL0/U;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ/x$a;->a()LL0/U;

    move-result-object v0

    return-object v0
.end method
