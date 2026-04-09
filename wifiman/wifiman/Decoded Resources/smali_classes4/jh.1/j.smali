.class final Ljh/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# instance fields
.field private final a:Ljava/io/BufferedReader;


# direct methods
.method public constructor <init>(Ljava/io/BufferedReader;)V
    .locals 1

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljh/j;->a:Ljava/io/BufferedReader;

    return-void
.end method

.method public static final synthetic c(Ljh/j;)Ljava/io/BufferedReader;
    .locals 0

    iget-object p0, p0, Ljh/j;->a:Ljava/io/BufferedReader;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Ljh/j$a;

    invoke-direct {v0, p0}, Ljh/j$a;-><init>(Ljh/j;)V

    return-object v0
.end method
