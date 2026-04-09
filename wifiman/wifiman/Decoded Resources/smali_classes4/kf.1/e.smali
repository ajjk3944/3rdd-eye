.class public final synthetic Lkf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lkf/b;

.field public final synthetic b:Lhf/o;


# direct methods
.method public synthetic constructor <init>(Lkf/b;Lhf/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkf/e;->a:Lkf/b;

    iput-object p2, p0, Lkf/e;->b:Lhf/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lkf/e;->a:Lkf/b;

    iget-object v1, p0, Lkf/e;->b:Lhf/o;

    invoke-static {v0, v1}, Lkf/f$a;->a(Lkf/b;Lhf/o;)LYg/J;

    move-result-object v0

    return-object v0
.end method
