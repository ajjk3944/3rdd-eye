.class public final synthetic Lwb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/logging/HttpLoggingInterceptor$Logger;


# instance fields
.field public final synthetic c:Lwb/d;


# direct methods
.method public synthetic constructor <init>(Lwb/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/b;->c:Lwb/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lwb/b;->c:Lwb/d;

    invoke-static {v0, p1}, Lwb/d;->b(Lwb/d;Ljava/lang/String;)V

    return-void
.end method
