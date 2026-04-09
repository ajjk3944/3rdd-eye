.class public final synthetic Lje/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lje/D;

.field public final synthetic b:Lje/r;


# direct methods
.method public synthetic constructor <init>(Lje/D;Lje/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lje/E;->a:Lje/D;

    iput-object p2, p0, Lje/E;->b:Lje/r;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lje/E;->a:Lje/D;

    iget-object v1, p0, Lje/E;->b:Lje/r;

    invoke-static {v0, v1}, Lje/D$f;->a(Lje/D;Lje/r;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
