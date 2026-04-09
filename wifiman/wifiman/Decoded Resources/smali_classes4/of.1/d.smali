.class public final synthetic Lof/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lof/a$c;


# direct methods
.method public synthetic constructor <init>(Lof/a$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof/d;->a:Lof/a$c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lof/d;->a:Lof/a$c;

    invoke-static {v0}, Lof/f;->c(Lof/a$c;)LYg/J;

    move-result-object v0

    return-object v0
.end method
