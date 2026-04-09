.class public Lcom/wireguard/config/ParseException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, v0, v0}, Lcom/wireguard/config/ParseException;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/CharSequence;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/wireguard/config/ParseException;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2
    iput-object p1, p0, Lcom/wireguard/config/ParseException;->a:Ljava/lang/Class;

    .line 3
    iput-object p2, p0, Lcom/wireguard/config/ParseException;->b:Ljava/lang/CharSequence;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/wireguard/config/ParseException;-><init>(Ljava/lang/Class;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
