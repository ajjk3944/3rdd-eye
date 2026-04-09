.class public abstract LM/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;

.field private static final b:J

.field private static final c:LM/K;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    sget-object v0, LM/L$a;->a:LM/L$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LT/w;->d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;

    move-result-object v0

    sput-object v0, LM/L;->a:LT/H0;

    const-wide v0, 0xff4286f4L

    invoke-static {v0, v1}, Lm0/x0;->d(J)J

    move-result-wide v0

    sput-wide v0, LM/L;->b:J

    new-instance v10, LM/K;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const v4, 0x3ecccccd    # 0.4f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide v2, v0

    invoke-static/range {v2 .. v9}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v2, v10

    move-wide v3, v0

    invoke-direct/range {v2 .. v7}, LM/K;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, LM/L;->c:LM/K;

    return-void
.end method

.method public static final synthetic a()LM/K;
    .locals 1

    sget-object v0, LM/L;->c:LM/K;

    return-object v0
.end method

.method public static final b()LT/H0;
    .locals 1

    sget-object v0, LM/L;->a:LT/H0;

    return-object v0
.end method
