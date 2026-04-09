.class public final synthetic LD9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LD9/o;


# direct methods
.method public synthetic constructor <init>(LD9/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD9/a;->a:LD9/o;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD9/a;->a:LD9/o;

    check-cast p1, LC0/r;

    invoke-static {v0, p1}, LD9/k;->i(LD9/o;LC0/r;)LYg/J;

    move-result-object p1

    return-object p1
.end method
