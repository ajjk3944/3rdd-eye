.class public final synthetic LDc/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:LDc/t;


# direct methods
.method public synthetic constructor <init>(LDc/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDc/r;->a:LDc/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LDc/r;->a:LDc/t;

    invoke-static {v0}, LDc/t;->c(LDc/t;)V

    return-void
.end method
