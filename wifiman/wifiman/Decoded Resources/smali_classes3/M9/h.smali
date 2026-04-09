.class public final synthetic LM9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/h;->a:Ljava/lang/String;

    iput-boolean p2, p0, LM9/h;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LM9/h;->a:Ljava/lang/String;

    iget-boolean v1, p0, LM9/h;->b:Z

    check-cast p1, LJ0/w;

    invoke-static {v0, v1, p1}, LM9/i;->c(Ljava/lang/String;ZLJ0/w;)LYg/J;

    move-result-object p1

    return-object p1
.end method
