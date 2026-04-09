.class abstract Lwj/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final a:Lwj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwj/b;

    invoke-direct {v0}, Lwj/b;-><init>()V

    sput-object v0, Lwj/a$a;->a:Lwj/b;

    return-void
.end method
