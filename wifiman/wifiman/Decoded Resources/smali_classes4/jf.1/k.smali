.class public final synthetic Ljf/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lhf/k;

.field public final synthetic b:Ljf/h;


# direct methods
.method public synthetic constructor <init>(Lhf/k;Ljf/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljf/k;->a:Lhf/k;

    iput-object p2, p0, Ljf/k;->b:Ljf/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljf/k;->a:Lhf/k;

    iget-object v1, p0, Ljf/k;->b:Ljf/h;

    invoke-static {v0, v1}, Ljf/l$a;->a(Lhf/k;Ljf/h;)LYg/J;

    move-result-object v0

    return-object v0
.end method
