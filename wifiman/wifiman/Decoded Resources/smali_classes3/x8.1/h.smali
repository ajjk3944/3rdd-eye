.class public final synthetic Lx8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lgc/b;


# direct methods
.method public synthetic constructor <init>(Lgc/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx8/h;->a:Lgc/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx8/h;->a:Lgc/b;

    check-cast p1, Lde/y;

    invoke-static {v0, p1}, Lx8/j;->D0(Lgc/b;Lde/y;)Lde/y;

    move-result-object p1

    return-object p1
.end method
