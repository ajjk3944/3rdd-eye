.class public final synthetic LM8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LEf/c;


# direct methods
.method public synthetic constructor <init>(LEf/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/i;->a:LEf/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM8/i;->a:LEf/c;

    check-cast p1, Lde/B;

    invoke-static {v0, p1}, LM8/j;->p0(LEf/c;Lde/B;)Lde/B;

    move-result-object p1

    return-object p1
.end method
