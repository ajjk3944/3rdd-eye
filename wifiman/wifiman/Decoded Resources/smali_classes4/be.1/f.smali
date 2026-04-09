.class public final synthetic Lbe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lbe/i;


# direct methods
.method public synthetic constructor <init>(Lbe/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/f;->a:Lbe/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbe/f;->a:Lbe/i;

    check-cast p1, Ll9/a;

    invoke-static {v0, p1}, Lbe/i;->f(Lbe/i;Ll9/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
