.class public final synthetic LQ9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ9/f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQ9/f;->a:Ljava/lang/String;

    check-cast p1, Lf2/z;

    invoke-static {v0, p1}, LQ9/h$a$a;->o(Ljava/lang/String;Lf2/z;)LYg/J;

    move-result-object p1

    return-object p1
.end method
