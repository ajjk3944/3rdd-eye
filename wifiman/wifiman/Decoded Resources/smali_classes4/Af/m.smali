.class public final synthetic LAf/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:LAf/c$a;


# direct methods
.method public synthetic constructor <init>(Lmh/l;LAf/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAf/m;->a:Lmh/l;

    iput-object p2, p0, LAf/m;->b:LAf/c$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LAf/m;->a:Lmh/l;

    iget-object v1, p0, LAf/m;->b:LAf/c$a;

    invoke-static {v0, v1}, LAf/l$b;->a(Lmh/l;LAf/c$a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
