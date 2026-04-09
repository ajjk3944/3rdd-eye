.class public final synthetic Ltb/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/f$c;


# instance fields
.field public final synthetic a:Ltb/N;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ltb/N;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/M;->a:Ltb/N;

    iput-object p2, p0, Ltb/M;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lorg/webrtc/DataChannel$State;)V
    .locals 2

    iget-object v0, p0, Ltb/M;->a:Ltb/N;

    iget-object v1, p0, Ltb/M;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Ltb/N;->l(Ltb/N;Ljava/lang/String;Lorg/webrtc/DataChannel$State;)V

    return-void
.end method
