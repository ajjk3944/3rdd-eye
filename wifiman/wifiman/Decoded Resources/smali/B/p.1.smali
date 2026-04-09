.class public abstract LB/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-static {v0}, Lr/I0;->c(LY0/n$a;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->b(J)LY0/n;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x43c80000    # 400.0f

    invoke-static {v3, v4, v0, v1, v2}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object v0

    sput-object v0, LB/p;->a:Lr/h0;

    return-void
.end method

.method public static final synthetic a()Lr/h0;
    .locals 1

    sget-object v0, LB/p;->a:Lr/h0;

    return-object v0
.end method
