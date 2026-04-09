.class public final synthetic LL9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/layout/t;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/layout/t;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/u;->a:Landroidx/compose/ui/layout/t;

    iput-wide p2, p0, LL9/u;->b:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LL9/u;->a:Landroidx/compose/ui/layout/t;

    iget-wide v1, p0, LL9/u;->b:J

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-static {v0, v1, v2, p1}, LL9/q$d$d;->d(Landroidx/compose/ui/layout/t;JLandroidx/compose/ui/layout/t$a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
