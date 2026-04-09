.class public LU2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU2/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LC2/a;Z)LU2/b;
    .locals 0

    sget-object p1, LU2/a;->a:LU2/a;

    return-object p1
.end method
