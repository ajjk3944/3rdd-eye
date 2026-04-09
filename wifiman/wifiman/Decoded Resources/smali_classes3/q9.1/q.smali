.class public final synthetic Lq9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Lq9/i;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LIi/N;Lq9/i;Ljava/util/List;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/q;->a:LIi/N;

    iput-object p2, p0, Lq9/q;->b:Lq9/i;

    iput-object p3, p0, Lq9/q;->c:Ljava/util/List;

    iput p4, p0, Lq9/q;->d:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lq9/q;->a:LIi/N;

    iget-object v1, p0, Lq9/q;->b:Lq9/i;

    iget-object v2, p0, Lq9/q;->c:Ljava/util/List;

    iget v3, p0, Lq9/q;->d:I

    invoke-static {v0, v1, v2, v3}, Lq9/o$c;->a(LIi/N;Lq9/i;Ljava/util/List;I)LYg/J;

    move-result-object v0

    return-object v0
.end method
