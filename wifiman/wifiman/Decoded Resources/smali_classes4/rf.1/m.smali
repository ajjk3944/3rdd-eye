.class public final synthetic Lrf/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:LN/R0;

.field public final synthetic c:Lmh/l;

.field public final synthetic d:LT/q0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LN/R0;Lmh/l;LT/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/m;->a:Ljava/lang/Object;

    iput-object p2, p0, Lrf/m;->b:LN/R0;

    iput-object p3, p0, Lrf/m;->c:Lmh/l;

    iput-object p4, p0, Lrf/m;->d:LT/q0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lrf/m;->a:Ljava/lang/Object;

    iget-object v1, p0, Lrf/m;->b:LN/R0;

    iget-object v2, p0, Lrf/m;->c:Lmh/l;

    iget-object v3, p0, Lrf/m;->d:LT/q0;

    check-cast p1, LT/L;

    invoke-static {v0, v1, v2, v3, p1}, Lrf/v;->a(Ljava/lang/Object;LN/R0;Lmh/l;LT/q0;LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
