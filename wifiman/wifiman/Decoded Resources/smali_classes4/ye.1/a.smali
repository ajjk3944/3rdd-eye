.class public final synthetic Lye/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lye/b$a;


# direct methods
.method public synthetic constructor <init>(Lye/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lye/a;->a:Lye/b$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lye/a;->a:Lye/b$a;

    invoke-static {v0}, Lye/b$a;->a(Lye/b$a;)LLi/g;

    move-result-object v0

    return-object v0
.end method
