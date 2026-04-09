.class public final synthetic Llb/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Llb/h$c;

.field public final synthetic b:Laj/j;


# direct methods
.method public synthetic constructor <init>(Llb/h$c;Laj/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/l;->a:Llb/h$c;

    iput-object p2, p0, Llb/l;->b:Laj/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llb/l;->a:Llb/h$c;

    iget-object v1, p0, Llb/l;->b:Laj/j;

    invoke-static {v0, v1}, Llb/h$c;->i(Llb/h$c;Laj/j;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
