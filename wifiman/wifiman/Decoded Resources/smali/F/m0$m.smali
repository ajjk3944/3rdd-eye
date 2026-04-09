.class final LF/m0$m;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->t(Landroidx/compose/ui/e;LL0/d$c;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LF/m0$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/m0$m;

    invoke-direct {v0}, LF/m0$m;-><init>()V

    sput-object v0, LF/m0$m;->a:LF/m0$m;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LF/m0$m;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->b(J)LY0/n;

    move-result-object v0

    return-object v0
.end method
