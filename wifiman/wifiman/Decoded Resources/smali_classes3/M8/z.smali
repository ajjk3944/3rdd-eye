.class public final synthetic LM8/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LM8/A;

.field public final synthetic b:LS8/c;


# direct methods
.method public synthetic constructor <init>(LM8/A;LS8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/z;->a:LM8/A;

    iput-object p2, p0, LM8/z;->b:LS8/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LM8/z;->a:LM8/A;

    iget-object v1, p0, LM8/z;->b:LS8/c;

    check-cast p1, Lde/E;

    invoke-static {v0, v1, p1}, LM8/A;->I0(LM8/A;LS8/c;Lde/E;)Lde/E;

    move-result-object p1

    return-object p1
.end method
