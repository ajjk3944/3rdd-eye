.class public final synthetic Lcd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Lcd/a$b;


# direct methods
.method public synthetic constructor <init>(Lcd/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd/c;->a:Lcd/a$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcd/c;->a:Lcd/a$b;

    invoke-static {v0}, Lcd/d;->b(Lcd/a$b;)V

    return-void
.end method
