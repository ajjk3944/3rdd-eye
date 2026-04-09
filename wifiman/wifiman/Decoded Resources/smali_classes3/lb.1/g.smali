.class public final synthetic Llb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Llb/h;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Llb/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/g;->a:Lmh/l;

    iput-object p2, p0, Llb/g;->b:Llb/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llb/g;->a:Lmh/l;

    iget-object v1, p0, Llb/g;->b:Llb/h;

    invoke-static {v0, v1}, Llb/h;->a(Lmh/l;Llb/h;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
