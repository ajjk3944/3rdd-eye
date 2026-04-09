.class public final synthetic LM8/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lde/E;


# direct methods
.method public synthetic constructor <init>(Lde/E;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/F;->a:Lde/E;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM8/F;->a:Lde/E;

    check-cast p1, LS8/c;

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p1, p2}, LM8/A$g;->c(Lde/E;LS8/c;Ljava/util/List;)LYg/J;

    move-result-object p1

    return-object p1
.end method
