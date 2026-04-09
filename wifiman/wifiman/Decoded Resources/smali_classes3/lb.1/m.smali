.class public final synthetic Llb/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Laj/j;


# direct methods
.method public synthetic constructor <init>(Laj/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/m;->a:Laj/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llb/m;->a:Laj/j;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Llb/h$c;->k(Laj/j;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method
