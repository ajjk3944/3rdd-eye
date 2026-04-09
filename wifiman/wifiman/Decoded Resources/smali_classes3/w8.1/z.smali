.class public final synthetic Lw8/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lw8/A;


# direct methods
.method public synthetic constructor <init>(Lw8/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/z;->a:Lw8/A;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw8/z;->a:Lw8/A;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lw8/A;->o0(Lw8/A;Ljava/lang/Integer;)V

    return-void
.end method
