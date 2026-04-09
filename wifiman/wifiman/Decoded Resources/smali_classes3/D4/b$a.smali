.class LD4/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD4/b;->b(Ljava/lang/String;LD4/a$b;)LD4/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic a:Ljava/lang/String;

.field private final synthetic b:LD4/b;


# direct methods
.method constructor <init>(LD4/b;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, LD4/b$a;->a:Ljava/lang/String;

    iput-object p1, p0, LD4/b$a;->b:LD4/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
