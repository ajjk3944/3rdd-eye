.class public final LSh/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LSh/k;

.field private final b:LSh/n;


# direct methods
.method public constructor <init>(LSh/k;LSh/n;)V
    .locals 1

    const-string v0, "deserializationComponentsForJava"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSh/k$a$a;->a:LSh/k;

    iput-object p2, p0, LSh/k$a$a;->b:LSh/n;

    return-void
.end method


# virtual methods
.method public final a()LSh/k;
    .locals 1

    iget-object v0, p0, LSh/k$a$a;->a:LSh/k;

    return-object v0
.end method

.method public final b()LSh/n;
    .locals 1

    iget-object v0, p0, LSh/k$a$a;->b:LSh/n;

    return-object v0
.end method
