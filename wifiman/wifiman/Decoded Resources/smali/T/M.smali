.class public final LT/M;
.super LT/H0;
.source "SourceFile"


# instance fields
.field private final b:LT/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LT/n1;Lmh/a;)V
    .locals 0

    invoke-direct {p0, p2}, LT/H0;-><init>(Lmh/a;)V

    iput-object p1, p0, LT/M;->b:LT/n1;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)LT/I0;
    .locals 9

    new-instance v8, LT/I0;

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v4, p0, LT/M;->b:LT/n1;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, LT/I0;-><init>(LT/u;Ljava/lang/Object;ZLT/n1;LT/q0;Lmh/l;Z)V

    return-object v8
.end method
