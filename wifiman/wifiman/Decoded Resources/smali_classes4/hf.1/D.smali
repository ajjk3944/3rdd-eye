.class public final synthetic Lhf/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/z1;

.field public final synthetic b:F

.field public final synthetic c:Lm0/V0;


# direct methods
.method public synthetic constructor <init>(LT/z1;FLm0/V0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/D;->a:LT/z1;

    iput p2, p0, Lhf/D;->b:F

    iput-object p3, p0, Lhf/D;->c:Lm0/V0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhf/D;->a:LT/z1;

    iget v1, p0, Lhf/D;->b:F

    iget-object v2, p0, Lhf/D;->c:Lm0/V0;

    check-cast p1, Lo0/f;

    invoke-static {v0, v1, v2, p1}, Lhf/J;->f(LT/z1;FLm0/V0;Lo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
