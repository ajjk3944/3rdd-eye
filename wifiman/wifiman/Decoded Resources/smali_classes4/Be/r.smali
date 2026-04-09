.class public final synthetic LBe/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LBe/r;->a:J

    iput-wide p3, p0, LBe/r;->b:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, LBe/r;->a:J

    iget-wide v2, p0, LBe/r;->b:J

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, v2, v3, p1}, LBe/u;->b(JJLandroid/content/Context;)Lh4/a;

    move-result-object p1

    return-object p1
.end method
