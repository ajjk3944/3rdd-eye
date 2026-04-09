.class public final synthetic Llb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Llb/h$c;


# direct methods
.method public synthetic constructor <init>(Llb/h$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/k;->a:Llb/h$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llb/k;->a:Llb/h$c;

    check-cast p1, Laj/j;

    invoke-static {v0, p1}, Llb/h$c;->j(Llb/h$c;Laj/j;)Llb/h;

    move-result-object p1

    return-object p1
.end method
