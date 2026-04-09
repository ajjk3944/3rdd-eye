.class public final synthetic Lj3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# instance fields
.field public final synthetic a:Lk3/c;


# direct methods
.method public synthetic constructor <init>(Lk3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/h;->a:Lk3/c;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj3/h;->a:Lk3/c;

    invoke-interface {v0}, Lk3/c;->j()Lf3/a;

    move-result-object v0

    return-object v0
.end method
