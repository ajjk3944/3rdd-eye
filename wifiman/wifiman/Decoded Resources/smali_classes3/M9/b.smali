.class public final synthetic LM9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lg0/d;

.field public final synthetic b:Lg0/h;


# direct methods
.method public synthetic constructor <init>(Lg0/d;Lg0/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/b;->a:Lg0/d;

    iput-object p2, p0, LM9/b;->b:Lg0/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LM9/b;->a:Lg0/d;

    iget-object v1, p0, LM9/b;->b:Lg0/h;

    check-cast p1, Lk0/l;

    invoke-static {v0, v1, p1}, LM9/c$a;->b(Lg0/d;Lg0/h;Lk0/l;)LYg/J;

    move-result-object p1

    return-object p1
.end method
