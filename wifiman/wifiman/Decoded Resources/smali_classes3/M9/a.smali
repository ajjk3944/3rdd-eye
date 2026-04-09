.class public final synthetic LM9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lg0/h;


# direct methods
.method public synthetic constructor <init>(Lg0/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/a;->a:Lg0/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM9/a;->a:Lg0/h;

    check-cast p1, LC0/r;

    invoke-static {v0, p1}, LM9/c$a;->a(Lg0/h;LC0/r;)LYg/J;

    move-result-object p1

    return-object p1
.end method
